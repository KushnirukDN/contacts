class Problem {

    public static void main(String[] args) {
        int count = -1;
        for (int i = 0; i < args.length; i++) {
            if ("test".equals(args[i])) {
                count = i;
            }
        }
        System.out.println(count);
    }
}
// или можно было сделать
// вот такую замануху:
// System.out.println(Arrays.asList(args).indexOf("test"));