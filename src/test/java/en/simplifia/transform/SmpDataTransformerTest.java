package en.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;
import org.mockito.Mockito;
import org.testng.annotations.Test;


public class SmpDataTransformerTest {

    private SmpInputValidator validator;

    public SmpDataTransformerTest(){
        validator = Mockito.mock(SmpInputValidator.class);
        //TODO : mocking strategy
        //when(validator.validateInput(input)).thenReturn();
    }

    @Test
    public void testTransformOk() throws Exception {

    }

    @Test
    public void testTransformNotOk() throws Exception {

    }


    @Test
    public void testTransformEmpty() throws Exception {

    }

    @Test
    public void testTransformNull() throws Exception {

    }


}