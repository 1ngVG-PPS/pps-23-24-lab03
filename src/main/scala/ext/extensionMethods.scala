package ext

import u02.AnonymousFunctions.l
import u03.Optionals.Optional

import u03.Sequences.* 
import Sequence.* 

object Task4:

    extension[A](l: Sequence[A])
    
        def map[B](mapper: A => B): Sequence[B] =
            Sequence.map(l)(mapper)

        def filter(pred: A => Boolean): Sequence[A] =
            Sequence.filter(l)(pred)

        def zip[B](second: Sequence[B]): Sequence[(A, B)] =
            Sequence.zip(l, second)

        def take(n: Int): Sequence[A] =
            Sequence.take(l)(n)
            
        def concat(l2: Sequence[A]): Sequence[A] =
            Sequence.concat(l, l2)

        def flatMap[B](mapper: A => Sequence[B]): Sequence[B] =
            Sequence.flatMap(l)(mapper)

        def foldLeft[B](v: B)(op: (B, A) => B): B =
            Sequence.foldLeft(l)(v)(op)

    




