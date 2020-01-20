import java.util.ArrayList;

public class QueueImplementation<E> implements Queue<E> {

  private ArrayList<E> queue;

  QueueImplementation(){
    queue = new ArrayList<E>();
  }

  public void enqueue(E elem){
    queue.add(elem);
  }

  public E dequeue(){
    E elem = queue.get(0);
    queue.remove(0);
    return elem;
  }

  public boolean isEmpty(){
    if(queue.size() < 1){
      return true;
    }
    else{
      return false;
    }
  }

  public int size(){
    return queue.size();
  }
}
