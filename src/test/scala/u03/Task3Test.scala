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
  val l2: Sequence[Person] = Cons(Teacher("Viroli", "PPS"), Cons(Student("Ricci", 1999), Nil()))

  @Test def testFoundCourses()=
    assertEquals(Nil(), foundCourses(Nil()))
    assertEquals(Cons("PPS", Nil()), foundCourses(l2))
    assertEquals(Cons("PPS", Cons("PCD", Nil())), foundCourses(l))

  @Test def testSearchCourses() =
    assertEquals(Nil(), searchCourses(Nil()))
    assertEquals(Cons("PPS", Nil()), searchCourses(l2))
    assertEquals(Cons("PPS", Cons("PCD", Nil())), searchCourses(l))
  
  @Test def testFlatSearch() =
    assertEquals(Nil(), flatSearch(Nil()))
    assertEquals(Cons("PPS", Nil()), flatSearch(l2))
    assertEquals(Cons("PPS", Cons("PCD", Nil())), flatSearch(l))



