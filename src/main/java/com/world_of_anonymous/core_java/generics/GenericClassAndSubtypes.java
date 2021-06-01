package com.world_of_anonymous.core_java.generics;

import java.util.List;

/**
 * We can subtype a generic class or interface by extending or implementing it.
 * The relationship between the type parameters of one class or interface and
 * the type parameters of another are determined by the extends and implements clauses.
 *
 * For example, ArrayList<E> implements List<E> that extends Collection<E>,
 * So ArrayList<String> is a subtype of List<String> and List<String> is subtype of Collection<String>.
 *
 * The subtyping relationship is preserved as long as we don’t change the type argument.
 * The subtypes of List<String> can be MyList<String,Object>, MyList<String,Integer> and so on.
 */

interface MyList<E, T> extends List<E> {}

public class GenericClassAndSubtypes {
}
