public class Demo {
    public static void main(String args[])
    {
        Linked_List<Integer> list=new Linked_List<Integer>();
        list.insertAtBegining(9);
        list.insertAtBegining(5);
        list.insertAtBegining(11);
        list.insertAtBegining(21);
        list.insertAtPos(0,10);
        list.display();
        list.deleteAtPos(2);
        System.out.println();
        list.display();
        System.out.println();
        System.out.println(list.getElementPos(1));
        list.UpdateValPos(0,29);
        list.display();
        System.out.println();
        list.DeleteAtEnd();
        list.DeleteAtEnd();
        list.display();
        list.insertAtEnd(17);
        list.insertAtEnd(21);
        list.insertAtEnd(30);
        System.out.println();
        list.display();
        System.out.println();
        System.out.println("Index position:"+list.SearchValue(17));
        System.out.println("The value contains the list:"+list.Contains(1));
        System.out.println("The length of list:"+list.length());
        System.out.println();
        list.reverseList();
        for(int a:list)
        {
            System.out.print(a+" ");
        }
    }
}
