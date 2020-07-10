package com.flamey;

public class MyLinkedList implements NodeList
{
    private ListItem root = null;

    public MyLinkedList(ListItem root)
    {
        this.root = root;
    }

    @Override
    public ListItem getRoot()
    {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem)
    {
        if(this.root == null)
        {
            //list is empty so the new item becomes the root
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null)
        {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0)
            {
                //NewItem is greater, move right if possible
                if(currentItem.next() != null)
                {
                    currentItem = currentItem.next();
                }
                else
                {
                    //there is no next, insert at the end of the list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }
            else if(comparison > 0)
            {
                //newItem is less, insert before/left
                if(currentItem.previous() != null)
                {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }
                else
                {
                    //Node is at the start, we make the new Item the new root
                    this.root.setPrevious(newItem);
                    newItem.setNext(this.root);
                    this.root = newItem;
                }

                return true;
            }
            else
            {
                //if we come to this then the items are equal so we do not add
                System.out.println(currentItem.getValue() + " is already present in the list. Cannot add");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item)
    {
        if(item != null)
        {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null)
        {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0)
            {
                //we found the item to delete
                if(currentItem == this.root)
                {
                    this.root = currentItem.next();
                }
                else
                {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null)
                        currentItem.next().setPrevious(currentItem.previous());
                    return true;
                }
            }
            else if (comparison < 0)
            {
                //if it doesnt match continue through the list
                currentItem = currentItem.next();
            }
            else
            {
                // > 0
                //We are at an item greater than the one to be deleted
                //due to our Alphabetic nature of our list there is no more
                //point in cycling through the list
                return false;
            }
        }

        //We reached the end without finding anything
        return false;
    }

    @Override
    public void traverse(ListItem root)
    {
        if (root == null)
        {
            System.out.println("The list is empty");
        }
        else
        {
            while (root != null)
            {
                System.out.print(root.getValue() + " ");
                root = root.next();
            }
        }
        System.out.println();
    }
}
