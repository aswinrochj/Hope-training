class StringBuilderDemo {

    public static void main(String[] args) {

        // Creating StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert()
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // 3. replace()
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);

        // 4. delete()
        sb.delete(5, 9);
        System.out.println("After delete: " + sb);

        // 5. deleteCharAt()
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);

        // 6. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 7. charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));

        // 8. setCharAt()
        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt: " + sb);

        // 9. length()
        System.out.println("Length: " + sb.length());

        // 10. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 11. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity: " + sb.capacity());

        // 12. substring()
        System.out.println("Substring (1 to 4): " + sb.substring(1, 4));

        // 13. indexOf()
        System.out.println("Index of 'o': " + sb.indexOf("o"));

        // 14. lastIndexOf()
        System.out.println("Last index of 'o': " + sb.lastIndexOf("o"));

        // 15. toString()
        String str = sb.toString();
        System.out.println("Converted to String: " + str);

        // 16. append different data types
        sb.append(100);
        sb.append(true);
        sb.append(3.14);
        System.out.println("After appending different types: " + sb);

        // 17. getChars()
        char[] arr = new char[10];
        sb.getChars(0, 5, arr, 0);
        System.out.print("Using getChars: ");
        for(char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 18. trimToSize()
        sb.trimToSize();
        System.out.println("Capacity after trimToSize: " + sb.capacity());

        // 19. subSequence()
        System.out.println("SubSequence (1 to 5): " + sb.subSequence(1, 5));

        // 20. compareTo()
        StringBuilder sb2 = new StringBuilder("Test");
        System.out.println("CompareTo result: " + sb.compareTo(sb2));
    }
}