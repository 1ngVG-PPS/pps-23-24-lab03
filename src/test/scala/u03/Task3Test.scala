package u03

import org.junit.*
import org.junit.Assert.*

class Task3Test:
  import u03.Task3.* 
  import Tasks.*

  import u03.Sequences.* 
  import Sequence.*

  import u02.Modules.* 
  import Person.*
  
  val l: Sequence[Person] = Cons(Teacher("Viroli", "PPS"), Cons(Teacher("Ricci", "PCD"), Nil()))

  @Test def testFoundCourses()=
    assertEquals(Nil(), foundCourses(Nil()))
    assertEquals(Cons("PPS", Cons("PCD", Nil())), foundCourses(l))



