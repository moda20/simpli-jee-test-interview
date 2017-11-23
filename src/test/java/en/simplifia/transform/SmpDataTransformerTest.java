package en.simplifia.transform;

import fr.simplifia.input.exception.InputException;
import fr.simplifia.input.validator.SmpInputValidator;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;


public class SmpDataTransformerTest {

    private SmpInputValidator validator;

    public SmpDataTransformerTest(){
        validator = Mockito.mock(SmpInputValidator.class);
        doNothing().when(validator).validateInput(anyString());
        //TODO : mocking strategy
        //when(validator.validateInput(input)).thenReturn();
    }

    @Test
    public void testTransformOk() throws Exception {
        doNothing().when(validator).validateInput("Welcom");
        try {
            validator.validateInput("Welcome");
        }catch (InputException ex){

        }
    }

    @Test
    public void testTransformNotOk() throws Exception {
        doThrow(InputException.class).when(validator).validateInput("é");
        fail("Invalid Input");
        try {
            validator.validateInput("é");
        }catch (InputException ex){

        }
    }


    @Test
    public void testTransformEmpty() throws Exception {
        doThrow(InputException.class).when(validator).validateInput("");
        fail("Empty Input");
        try {
            validator.validateInput("");
        }catch (InputException ex){

        }
    }

    @Test
    public void testTransformNull() throws Exception {
        doThrow(InputException.class).when(validator).validateInput(null);
        fail("Null Input");
        try {
            validator.validateInput(null);
        }catch (InputException ex){

        }
    }


}