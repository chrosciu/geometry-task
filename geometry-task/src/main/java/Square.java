
public class Square {
}

/*
Below results in: 'Square' is not allowed in the sealed hierarchy

public class Square implements Shape {}
*/

/*
Below result in: 'Square' is not allowed in the sealed hierarchy

public class Square extends Polygon {}
*/

