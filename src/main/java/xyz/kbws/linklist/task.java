package xyz.kbws.linklist;

/**
 * @author Etenal
 * @date 2023/12/19
 * @description:
 */
public class task {
    // 定义学生节点
    static class Student {
        String name;
        String language;
        Student next;

        public Student(String name, String language) {
            this.name = name;
            this.language = language;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // 创建一个学生链表
        Student head = new Student("Alice", "Java");
        head.next = new Student("Bob", "CPP");
        head.next.next = new Student("Charlie", "Python");
        head.next.next.next = new Student("David", "Java");
        head.next.next.next.next = new Student("Eva", "CPP");
        head.next.next.next.next.next = new Student("Frank", "Python");

        // 创建三个语言链表
        Student javaList = null;
        Student cppList = null;
        Student pythonList = null;

        // 遍历原始链表，根据语言插入到相应语言链表的末尾
        Student current = head;
        while (current != null) {
            Student newStudent = new Student(current.name, current.language);
            switch (current.language) {
                case "Java":
                    javaList = insertStudent(javaList, newStudent);
                    break;
                case "CPP":
                    cppList = insertStudent(cppList, newStudent);
                    break;
                case "Python":
                    pythonList = insertStudent(pythonList, newStudent);
                    break;
            }
            current = current.next;
        }

        // 打印每个语言的学生列表
        System.out.println("Java List:");
        printList(javaList);

        System.out.println("\nCPP List:");
        printList(cppList);

        System.out.println("\nPython List:");
        printList(pythonList);
    }

    // 插入学生到链表末尾
    private static Student insertStudent(Student list, Student newStudent) {
        if (list == null) {
            return newStudent;
        } else {
            Student current = list;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newStudent;
            return list;
        }
    }

    // 打印链表
    private static void printList(Student list) {
        Student current = list;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Language: " + current.language);
            current = current.next;
        }
    }
}
