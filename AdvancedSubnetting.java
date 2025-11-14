import java.util.*;
public class AdvancedSubnetting {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter IP address (e.g., 192.168.1.0): ");
        String ipAddress = scanner.nextLine();

        System.out.print("Enter CIDR notation (e.g., /26): ");
        int cidr = scanner.nextInt();
        int totalBits = 32;
        int networkBits = cidr;
        int hostBits = totalBits - networkBits;

        int hostsPerSubnet = (int) Math.pow(2, hostBits) - 2;
        String subnetMask = calculateSubnetMask(cidr);
        System.out.println("\n===== Subnetting Results =====");
        System.out.println("IP Address: " + ipAddress);
        System.out.println("CIDR Notation: /" + cidr);
        System.out.println("Subnet Mask: " + subnetMask);
        System.out.println("Usable Hosts per Subnet: " + hostsPerSubnet);

        System.out.println("\nListing Subnets...\n");
        listSubnets(ipAddress, cidr);
    }
 private static String calculateSubnetMask(int cidr) {
        int mask = 0xffffffff << (32 - cidr);
        return String.format("%d.%d.%d.%d",
                (mask >>> 24) & 0xff,
                (mask >>> 16) & 0xff,
                (mask >>> 8) & 0xff,
                mask & 0xff);
    }
    private static void listSubnets(String ipAddress, int cidr) {
        String[] octets = ipAddress.split("\\.");
        long ip = ((Long.parseLong(octets[0]) << 24) |
                  (Long.parseLong(octets[1]) << 16) |
                  (Long.parseLong(octets[2]) << 8) |
                   Long.parseLong(octets[3]));

        int hostBits = 32 - cidr;
        long subnetSize = (long) Math.pow(2, hostBits);
        int subnetCount = (int) Math.pow(2, cidr % 8 == 0 ? 0 : 8 - (cidr % 8));
        for (int i = 0; i < 4; i++) { 
            long networkAddress = ip + (i * subnetSize);
            long broadcastAddress = networkAddress + subnetSize - 1;
            long firstHost = networkAddress + 1;
            long lastHost = broadcastAddress - 1;
 System.out.println("Subnet #" + (i + 1));
            System.out.println("Network Address: " + longToIP(networkAddress));
            System.out.println("Broadcast Address: " + longToIP(broadcastAddress));
            System.out.println("First Host: " + longToIP(firstHost));
            System.out.println("Last Host: " + longToIP(lastHost));
            System.out.println("Usable Hosts: " + ((int) Math.pow(2, hostBits) - 2));
            System.out.println("---------------------------");
        }
    }
     private static String longToIP(long ip) {
        return String.format("%d.%d.%d.%d",
                (ip >> 24) & 0xff,
                (ip >> 16) & 0xff,
                (ip >> 8) & 0xff,
                ip & 0xff);
    }
}