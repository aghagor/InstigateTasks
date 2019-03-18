public class ReverceWords {
    public static void main(String[] args) {
        String str = "Hello world kj adas njh kj erqn 89907";
        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = strArray.length - 1; i >= 0; i--) {
            sb.append(strArray[i] + " ");
        }
        System.out.println(sb);
    }
}
