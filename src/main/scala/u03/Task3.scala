package u03
import u02.AnonymousFunctions.l

object Task3:
  
  import u03.Sequences.* 
  import Sequence.*

  import u02.Modules.* 
  import Person.*

    object Tasks:

        def foundCourses(l: Sequence[Person]): Sequence[String] = l match
            case Cons(h, t) => h match
                case Teacher (n, c) => Cons(c, foundCourses(t))
                case _ => Nil()
            case Nil() => Nil()
        
        
        
    
        

