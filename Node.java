public class Node
{
  private Node next;
  private Object object;
  
  public Node(Object object, Node next) 
  {
   this.object = object; 
   this.next = next; 
  }

  public void setObject(Object object) 
  {
   this.object = object;  
  }

  public void setNext(Node next)  
  {
   this.next = next; 
  }

  public Object getObject()
  {
   return object; 
  }

  public Node getNext()
  {
   return next; 
  }

}