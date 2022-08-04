
package javaapplication4;
import java.util.ArrayList;

public class Colecao 
{
    private ArrayList<CD>collection = new ArrayList();
    CD C;
    public ArrayList<CD> getCollection() 
    {
        return collection;
    }

    public void setCollection(ArrayList<CD> collection) 
    {
        this.collection = collection;
    }
    public void ADDcd(CD C)
    {
        collection.add(C);
    }
    public void removeCD(CD C)
    {
        collection.remove(C);
    }        
    public void listaCD()
    {
        CD C;
        for(int i=0; i<collection.size(); i++)
        {
            C = collection.get(i);
            System.out.println(C.toString());
        }    
    }        
    public void listaGenero()
    {
        CD C;
        for(int i=0 ; i<collection.size();i++)
        {
            C = collection.get(i);
            System.out.println(C.getGenero());
        }    
    }        
    public void listaArtista()
    {
        CD C;
        for(int i=0;i<collection.size();i++)
        {
            C = collection.get(i);
            System.out.println(C.getArtista());
        }    
    }        
}
