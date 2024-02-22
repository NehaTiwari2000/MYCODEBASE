package collection;

public class LinkedListDummy {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.addFirstNode(10);
        linkedList.addLastNode(20);
        linkedList.addFirstNode(100);
        linkedList.addLastNode(2000);
        linkedList.addLastNode(10000);
        showDetails(linkedList);
        linkedList.deleteNode();
        System.out.println("after deleting first time ");
        showDetails(linkedList);
        linkedList.deleteByData(20);
        System.out.println("after deleting 20");
        showDetails(linkedList);
        linkedList.updateData(2000, 900000);
        System.out.println("after updating");
        showDetails(linkedList);
        linkedList.deleteLastNode();
        showDetails(linkedList);
        linkedList.addInMiddleByDataAndIndex(12, 8);
        showDetails(linkedList);
    }

    private static void showDetails(LL linkedList) {
        linkedList.printList();
        linkedList.sizeOfLL();
    }
}

class LL {
    Node head;
    Integer sizeOfLL;

    LL() {
        sizeOfLL = 0;
    }

    @Override
    public String toString() {
        return "LL{" +
                "head=" + head +
                '}';
    }

    void sizeOfLL() {
        System.out.println("The size of LL " + this.sizeOfLL);
    }

    String addLastNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return "Created";
        }
        Node track = head;
        while (track.addressOfNextNode != null) {
            track = track.addressOfNextNode;
        }
        track.addressOfNextNode = newNode;
        return "Created";
    }

    //    add in middle based on specific index
    void addInMiddleByDataAndIndex(int data, int index) {
        if (head == null ||  sizeOfLL+1<index) {
            return;
        }
        if (index == 0) {
            this.addFirstNode(data);
            return;
        }
//        //        12--->???--->13
//        Node trackNode = head;
//        Node trackNode2=null;
//        sizeOfLL++;
////        12 23  45 ???? 6          100 , 2
//        for (int i = 0; i <= sizeOfLL-1; i++) {
//            if (i < index-1) {
//                trackNode=trackNode.addressOfNextNode;
//            }
//            trackNode2=trackNode.addressOfNextNode;
//            Node newNode = new Node(data);
//            trackNode.addressOfNextNode=newNode;
//            newNode.addressOfNextNode=trackNode2;
//        }


        int counter=1;
        Node track = head;
        while (counter<index){
            track=track.addressOfNextNode;
            counter++;
        }
//        2 pointer node are not needed.......
        Node newNode=new Node(data);
        newNode.addressOfNextNode=track.addressOfNextNode;
        track.addressOfNextNode=newNode;
    }

    String addFirstNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return "Created";
        }
        newNode.addressOfNextNode = head;
        head = newNode;
        return "Created";
    }
//    delete head
    void deleteNode(){
        if(head==null){
            return;
        }
        Node nextNodeToHead= head;
        head=nextNodeToHead.addressOfNextNode;
        sizeOfLL--;
    }

    //    delete last
    void deleteLastNode() {
        if (head == null) {
            return;
        }
        Node trackNode = head;
        Node previousNode = head;
        while (trackNode.addressOfNextNode != null) {
            previousNode = trackNode;
            trackNode = trackNode.addressOfNextNode;
        }
        previousNode.addressOfNextNode = null;
        sizeOfLL--;
    }

//    delete by giving data
    void deleteByData(Integer data){
        if(head==null){return;}
        if(head.data==data){
          this.deleteNode();
            return;
        }
        Node trackNode=head;
        Node previousNode=trackNode;

        while (trackNode.data != data && trackNode.addressOfNextNode != null) {
            previousNode=trackNode;
            trackNode=trackNode.addressOfNextNode;
        }
        if(trackNode.data==data){sizeOfLL--;}
        previousNode.addressOfNextNode=trackNode.addressOfNextNode;


    }


    void updateData(Integer previousData,Integer updatedData){
        if(head==null){
        return;
        }
        if(head.data==previousData){
            head.data=updatedData;
            return;
        }
        Node trackNode= head;
        while (trackNode.data!=previousData && trackNode.addressOfNextNode!=null){
            trackNode=trackNode.addressOfNextNode;
        }
        trackNode.data=trackNode.data==previousData?updatedData:trackNode.data;
    }

    void printList(){
        if(head==null){
            return;
        }
        Node trackNode = head;
        while (trackNode.addressOfNextNode!=null){
            System.out.print(trackNode.data+" --> ");
            trackNode=trackNode.addressOfNextNode;
        }
        System.out.print(trackNode.data);
        System.out.println();
    }


    class Node {
        int data;
        Node addressOfNextNode;

        Node(int data) {
            this.data = data;
            this.addressOfNextNode = null;
            sizeOfLL++;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", addressOfNextNode=" + addressOfNextNode +
                    '}';
        }
    }
}