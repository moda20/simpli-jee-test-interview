package fr.simplifia.input.validator;

import fr.simplifia.input.exception.InputException;

public interface SmpInputValidator {
   void  validateInput(final String input) throws InputException;
}
