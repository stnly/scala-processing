package scalaprocessing

import processing.core._
import PConstants._
import PApplet._

class Main extends PApplet {

  import scala.util.Random
  private val rand = new Random

  implicit def seq2RichRandom[K](seq: Seq[K]) = new RichRandom(seq)

  protected class RichRandom[K](seq: Seq[K]) {
    def random: K = seq((rand.nextFloat * seq.length).toInt)
  }

  val d = 200

  override def setup {
    size(d * 2, d * 2)
    background(0, 10, 20)
  }

  var a = List(List(d / 2, 0, 255, 0, 0), List(d, d, 0, 255, 0), List(0, d, 0, 0, 255))
  var p = List(d, 0, 255, 0, 0)

  override def draw() {
    for(i <- 1 to 10) {
      p = p zip a.random map{ case (x, y) => x / 2 + y }
      stroke(p(2), p(3), p(4))
      point(p(0), p(1))
    }
  }
}

object Main {
  def main(args:Array[String]) {
    PApplet.main(Array("scalaprocessing.Main"))
  }
}
