package teste;

import br.ufrn.imd.edb2.aula06.Sorter;
import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest {

    private Sorter sorter;

    @org.junit.Before
    public void setUp() throws Exception {
        sorter = new Sorter();
    }

    @Test
    public void sortDeveOrdenarOArray(){
        int [] items = new int[100];
        int [] items2 = { 4, 3, 2, 1, 0};

        for( int i = 0; i < items.length; ++i){
            items[i] = items.length - 1 - i;

        }

        sorter.sort(items);

        for(int i = 0; i < items.length; ++i){
            assertEquals(i, items[i]);
        }
    }
}