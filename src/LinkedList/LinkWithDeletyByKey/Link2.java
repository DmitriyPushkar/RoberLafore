package LinkedList.LinkWithDeletyByKey;

import LinkedList.Link.Link;

public class Link2 {

        public int iData;
        public double dData;
        public LinkedList.Link.Link next;
        public Link2(int iData, double dData){
            this.iData=iData;
            this.dData=dData;
        }
        public void displayLink(){
            System.out.println("{"+ iData+", "+ dData+ "}");

    }
}
