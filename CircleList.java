public class CircleList
{
  private Node cursor; 
  private int size;
  
  public CircleList() 
  {
   cursor = null; 
   size = 0; 
  }

  public int getSize() 
  {
   return size; 
  }

  public Node getCursor() 
  {
   return cursor; 
  }

  public void advanceCursor() 
  {
   cursor = cursor.getNext(); 
  }

  public void addElement(Node newElement)
  {
    if(cursor == null)
    {
     newElement.setNext(newElement); 
     cursor = newElement; 
    }

    else
    {
     newElement.setNext(cursor.getNext()); 
     cursor.setNext(newElement); 
    }
    
    size = size + 1; 
  }

  public void remove()
  { 
   Node remElement = cursor.getNext();
   
   if(remElement == cursor)
   { 
    cursor = null;
    size = size - 1; 
   }
   else
   {
    cursor.setNext(remElement.getNext());
    remElement.setNext(null);
    size = size - 1; 
   }   
  }
  
  public String toString()
  {
	String s = "[" + cursor.getObject();
	
	if(cursor == null)
	 return s="[]";
 
    Node temp = cursor.getNext();
	while(temp!= cursor) 
	{
     s+=", " + temp.getObject();
	 temp = temp.getNext();
	}
	
	return s+"]";
  }
}