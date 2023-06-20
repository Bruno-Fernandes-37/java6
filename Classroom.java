class Classroom {
    public static void main(String[] args) {
        Wilder bruno = new Wilder("Bruno", true);
        Wilder jeau = new Wilder("Jean", false);
        Wilder sophie = new Wilder("Sophie", true);
        Wilder audrey = new Wilder("Audrey", true);
        System.out.println(bruno.whoAmI());
        System.out.println(jeau.whoAmI());
        System.out.println(sophie.whoAmI());
        System.out.println(audrey.whoAmI());
    }
}