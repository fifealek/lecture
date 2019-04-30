package com.groovy.run

class H1 {

  static void myPrintln(s){

        print 'hello'+ s
    }

    public static void main(def a) {
        def number = 0

        new File('/home/fife/groovy/groovy-2.5.6/conf/groovy-starter.conf').eachLine { line ->
            number++
            println "$number: $line"


        }

        assert (true)
        assert 1 == 1

        def x = 1

        //print "x= " + x
        assert x == 1
        def y = 1; assert y == 1

        def c = 5; def f = 12
//        assert f ==c+c+c
        assert ('text' * 3 << 'hello').size() == 4 * 3 + 5
          def str='text' * 3 << 'hello'
        myPrintln(str.size())
    }

}
