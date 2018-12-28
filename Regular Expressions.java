/*common regex validators
  ^ -> anchors the regex and ensures that the validated value must start with the next validator
  $ -> anchors the regex and ensures that the validated value must end with the previous validator
  ? -> conditional operator for the previous validator, means it may or may not exist
  * -> multiple operator for the previous validator, means there may be 0 or more matches in the value
  + -> matches previous validator, means there may be 1 or more matches in the value
  | -> OR operator
  \s -> whitespace character validator
  \S -> non-space character validator
  \d -> digit validator
  \w -> word character validator
  () -> grouping operator
  (?: -> group but don't capture
  [0-9] -> matches any digits in the range of 0 to 9
  [a-z] -> matches any lowercase character between a to z
  [A-Z] -> matches any uppercase character between A to Z
  . -> matches any character, wildcard character
*/
/**
  -Below regex values do not include escapre characters
*/
public static final String ZIPCODEREGEX = "^[0-9]{5}$";
public static final String ZIPCODEPLUSFOURREGEX = "^[0-9]{5}-([0-9]{4})$";
public static final String ZIPCODEOPTIONALPLUSFOURREGEX = "^[0-9]{5}(?:-[0-9]{4})?$";

public static final String PHONENUMBERWAREACODE = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$";
public static final String PHONENUMBER = "^[0-9]{3}-[0-9]{4}$";

public static final String DOLLARAMOUNTREGEX = "^\$[0-9]*\.[0-9]{2}$";

public static final String CREDITCARDREGEX = "^[0-9]{4}\s?[0-9]{4}\s?[0-9]{4}\s?[0-9]{4}$";

public static final String FEETANDINCHES = "^[0-9]+'[0-9]+\"$";
public static final String FEETANDINCHESABBREVIATED = "^[0-9]+\s*ft\s+[0-9]+\s*in$";
public static final String INCHESWSYMBOL = "^[0-9]+\"$";
public static final String INCHESWABBREVIATION = "^[0-9]+\s*in$";
public static final String INCHESSPELLEDOUT = "^[0-9]+\s*inches$";
public static final String FEETWSYMBOL = "^[0-9]+'$";
public static final String FEETWABBREVIATION = "^[0-9]+\s*ft$";
public static final String FEETSPELLEDOUT = "^[0-9]+\s*feet$";

public static final String IP4REGEX = "^(1?[0-9]?[0-9]|2[0-5][0-9]|25[0-5])\. " +
                                      "(1?[0-9]?[0-9]|2[0-5][0-9]|25[0-5])\." +
                                      "(1?[0-9]?[0-9]|2[0-5][0-9]|25[0-5])\." +
                                      "(1?[0-9]?[0-9]|2[0-5][0-9]|25[0-5])$";

public static final String LATITUDEDECIMALREGEX = "^-?[1-9]?[0-9](?:\.[0-9]*)?$";
public static final String LONGITUDDECIMALEREGEX = "^-?1?[0-9]?[0-9](?:\.[0-9]*)?$";

public static final String LATITUDEDEGREEMINSECREGEX = "^-?[1-9]?[0-9]°[0-6]?[0-9]'[0-6]?[0-9]\"$";
public static final String LONGITUDEDEGREEMINSECREGEX = "^-?1?[0-9]?[0-9]°[0-6]?[0-9]'[0-6]?[0-9]\"$";
