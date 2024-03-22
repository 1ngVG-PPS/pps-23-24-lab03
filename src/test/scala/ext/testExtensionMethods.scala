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

    @Test def testTake() =
        assertEquals(l.take(2), Sequence.take(l)(2))

    @Test def testConcat() = 
        val l2: Sequence[Int] = Cons(40, Cons(50, Nil()))
        assertEquals(l.concat(l2), Sequence.concat(l, l2))

    @Test def testFlatMap() = 
        assertEquals(l.flatMap((v => Cons(v + 1, Nil()))), Sequence.flatMap(l)(v => Cons(v + 1, Nil())))

    @Test def testFoldLeft() = 
        assertEquals(l.foldLeft(1)(_ * _), Sequence.foldLeft(l)(1)(_ * _))




        
    
    


    

    
    
   
