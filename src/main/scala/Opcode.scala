object Opcode {
  type Opcode = Symbol
  def <~~(a: Opcode, b: Opcode): Boolean = (b == a) || (b == 'Opcode)
  def toString(moves: List[Opcode]) = (moves map { _ match {
      case 'MoveLeft  => "L"
      case 'MoveRight => "R"
      case 'MoveUp    => "U"
      case 'MoveDown  => "D"
      case 'Wait      => "W"
      case 'Abort     => "A"
      case 'Razor     => "S"
    }
  }).mkString
}

sealed trait Status
case class Playing() extends Status
case class Win() extends Status
case class Lost() extends Status
