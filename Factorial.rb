class Integer
  def factorial
    if self==0
      1
    else
      return self*(self-1).factorial
    end
  end
end

puts "7!: #{7.factorial}"
puts "100!: #{100.factorial}"
puts "30!: #{30.factorial}"
puts "0!: #{0.factorial}"