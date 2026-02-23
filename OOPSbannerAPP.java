public class OOPSbannerAPP{

    public static void main(String[] args) {

        // Single declaration + initialization using String.join()
        String[] banner = {
                String.join("   ",
                        " ██████╗ ",
                        " ██████╗ ",
                        "██████╗ ",
                        " ██████╗ "),
                String.join("   ",
                        "██╔═══██╗",
                        "██╔═══██╗",
                        "██╔══██╗",
                        "██╔════╝"),
                String.join("   ",
                        "██║   ██║",
                        "██║   ██║",
                        "██████╔╝",
                        "╚█████╗ "),
                String.join("   ",
                        "██║   ██║",
                        "██║   ██║",
                        "██╔═══╝ ",
                        " ╚═══██╗"),
                String.join("   ",
                        "██║   ██║",
                        "██║   ██║",
                        "██║     ",
                        "██████╔╝"),
                String.join("   ",
                        "╚██████╔╝",
                        "╚██████╔╝",
                        "██║     ",
                        "╚═════╝ "),
                String.join("   ",
                        " ╚═════╝ ",
                        " ╚═════╝ ",
                        "╚═╝     ",
                        "        ")
        };

        // Enhanced for loop to print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}