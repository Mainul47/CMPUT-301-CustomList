import static org.testng.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestListCity {
    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize + 1, list.getCount());
    }
}
