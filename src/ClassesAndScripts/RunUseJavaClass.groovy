package ClassesAndScripts
/***
 * Excerpted from "Programming Groovy, 2nd Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vslg2 for more book information.
***/
"groovyc -j AJavaClass.java UseJavaClass.groovy -Jsource 1.6".execute().text
println "groovy UseJavaClass.groovy".execute().text
new File("AJavaClass.class").deleteOnExit()
new File("UseJavaClass.class").deleteOnExit()