
package jListSelector;

import java.util.ArrayList;

class ComboItem
{
    private String key;
    private ArrayList value;

    public ComboItem(String key, ArrayList value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public ArrayList getValue()
    {
        return value;
    }
}
