public class Crypto {
    public static void main(String[] args) {
        String text = "XYZ";
        char[] abc = {
            'a', 'à', 'á', 'b', 'c', 'ç', 
            'd', 'e', 'é', 'è', 'f',
             'g', 'h', 'i', 'í', 'ì', 'ï', 'j', 'k', 
             'l', 'm', 'n', 'ñ', 'o', 'ó', 'ò', 
             'ö', 'p', 'q', 'r', 's', 't', 'u', 
             'ú', 'ü', 'v', 'w', 'x', 'y', 'z'
        };
        String newText = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c ) {
                if (Character.isLowerCase(c)) {
                for (int x = 0; x < abc.length; x++) {
                    if (c == abc[x]) {
                        if (x + 13 > abc.length) {
                            int val = (x+13) % 13;
                            newText += abc[val+13];
                        } else {
                            newText += abc[x+13];
                        }
                    }
                }
            } else {
                for (int y = 0; y < abc.length; y++) {
                        if (c == Character.toUpperCase(abc[y])) {
                            if (y + 13 > abc.length) {
                                int val = (y+13) % 13;
                                newText += Character.toUpperCase(abc[val+13]);
                            } else {
                                newText += Character.toUpperCase(abc[y+13]);
                            }
                        }
                }
            }
            }
            else {
                newText += c;
            }
        }
        System.err.println(newText);

    }
}