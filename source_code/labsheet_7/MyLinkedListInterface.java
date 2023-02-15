package source_code.labsheet_7;

public interface MyLinkedListInterface {
    public void addBeginning(Object data);

    public void addEnding(Object data);

    public void addIndex(int index, Object data);

    public Object getElement(int index);

    public Object removeBeginning();

    public Object removeEnding();

    public Object removeIndex(int index);

    public Object setElement(int index, Object newData);

    public int indexOf(Object data);

    public int lastIndexOf(Object data);

    public boolean contains(Object data);

    public boolean isEmpty();

    public int getSize();

    public int checkElementIndex(int index);

}
