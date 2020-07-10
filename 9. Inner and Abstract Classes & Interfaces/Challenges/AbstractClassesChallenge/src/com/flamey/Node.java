package com.flamey;

public class Node extends ListItem
{
    public Node(Object value)
    {
        super(value);
    }

    @Override
    public ListItem previous()
    {
        return leftLink;
    }

    @Override
    public ListItem next()
    {
        return rightLink;
    }

    @Override
    public ListItem setNext(ListItem item)
    {
        rightLink = item;
        return rightLink;
    }

    @Override
    public ListItem setPrevious(ListItem item)
    {
        leftLink = item;
        return leftLink;
    }

    @Override
    int compareTo(ListItem item)
    {
        if(item != null)
        {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        else
        {
            return -1;
        }
    }
}
