package com.flamey;

public abstract class ListItem
{
    protected ListItem leftLink;
    protected ListItem rightLink;

    protected Object value;

    public ListItem(Object value)
    {
        this.value = value;
    }

    public abstract ListItem previous();
    public abstract ListItem next();
    public abstract ListItem setNext(ListItem item);
    public abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }
}
