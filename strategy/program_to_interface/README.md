Programming to an interface means programming to a supertype.
i.e. the declared type of the variables must be a supertype (usuaally abstract class or interface)

De esta manera, los objetos asignados a esas variables pueden ser de cualquier clase que implemente ese supertipo.
Esto ayuda a que la clase que declara esas variables no tenga que necesariamente saber los tipos específicos, lo que 
permite hacerlos intercambiables en tiempo de ejecución.

Recuerda que las clases se crean en tiempo de compilación, entonces todos los fields definidos en las clases, si asignas un objeto, quedan definidos (bloqueados) en tiempo de compilación también.
Aunque puedan cambiarse mediante setters, si usamos un tipo concreto y no un súpertipo, nos estamos limitando a asignar ese tipo de objeto.
Nos bloqueamos en una implementación.
Es mucho más flexible usar un súpertipo.

Parece que la herencia es útil (no es una molestia) solo cuando se trata de comportamiento que no varía.