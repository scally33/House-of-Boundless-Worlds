class hello {
    public static void main(String [] args){
        System.out.println("Hello World!");
        multiplier("Soup", 5);
        multiplier(messageMaker(), 3);
    }

    public static void multiplier(String str, int scale){
        for (int i = 0; i < scale; i++)
            System.out.println(str);
    }

    public static String messageMaker(){
        return "I missed Java so much ;-;";
    }
}