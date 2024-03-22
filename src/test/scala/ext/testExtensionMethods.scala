package ext

import org.junit.*
import org.junit.Assert.*

import u02.AnonymousFunctions.l

class testExt:
    import ext.Task4.*

    import u03.Sequences.Sequence
    import Sequence.Cons
    import Sequence.Nil

    val l: Sequence[Int] = Cons(10, Cons(20, Cons(30, Nil())))

    @Test def testMap() = 
        assertEquals(l.map(_ + 1), Sequence.map(l)(_ + 1))

    @Test def testFilter() =
        assertEquals(l.filter(_ >= 20), Sequence.filter(l)(_ >= 20))

    @Test def testZip() =
        val l2: Sequence[String] = Cons("10", Cons("20", Cons("30", Nil())))
        assertEquals(l.zip(l2), Sequence.zip(l, l2))
    
    


    

    
    
   
