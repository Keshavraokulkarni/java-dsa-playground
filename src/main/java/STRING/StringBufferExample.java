package STRING;

public class StringBufferExample {
    public static void main(String[] args) {
        /*
        | Method               | Purpose                             |
| -------------------- | ----------------------------------- |
| `append(str)`        | Adds `str` at the end.              |
| `insert(idx, str)`   | Inserts `str` at index `idx`.       |
| `delete(start, end)` | Deletes from `start` to `end-1`.    |
| `reverse()`          | Reverses the string.                |
| `capacity()`         | Returns the capacity of the buffer. |
| `length()`           | Returns the current length.         |

         */

        StringBuffer sb = new StringBuffer("Hi ");
        sb.append("Hello");
        sb.insert(2," Keshav");
        System.out.println("after insert:"+sb);
        sb.delete(9,15);
        System.out.println("after delete:"+sb);
        sb.reverse();
        System.out.println("reverse:"+sb);
        System.out.println("capacity:"+sb.capacity());
        System.out.println("length:"+sb.length());

    }
}
