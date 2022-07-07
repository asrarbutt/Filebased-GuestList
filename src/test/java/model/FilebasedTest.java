package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FilebasedTest {


    @Test
    void shouldBeEmptyInitially(){

        //Given
        GuestList party= new GuestList();
        party.setGuests(Collections.emptyList());

        //when
        List<String> actual=party.getGuests();

       //then
        Assertions.assertEquals(Collections.emptyList(), actual);

    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore(){

        //Given
        GuestList party= new GuestList();
        party.setGuests(List.of("Karl", "Ute"));

        List<String> actual=party.getGuests();

        Assertions.assertEquals(List.of("Karl", "Ute"), actual);




    }
}
