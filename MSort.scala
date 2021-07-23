

object Msort {

  def msort[T<% Ordered[T]](xs: List[T]): List[T] = {

    def merge(res: List[T], xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
      case (_, Nil) => res.reverse ::: xs
      case (Nil, _) => res.reverse ::: ys
      case (x :: xs1, y :: ys1) =>
        if (x < y) merge(x :: res, xs1, ys)
        else merge(y :: res, xs, ys1)
    }

    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (ys, zs) = xs splitAt n
      merge(Nil, msort(ys), msort(zs))
    }
  }

  def main(args: Array[String]) {
    val list = List(4,7,8,1,-4,22,5,-44)
    println(msort(list))
  }
}