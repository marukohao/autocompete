def sort(str)
  return str.chars.sort.join
end

lines = ARGF.read.split("\n")
i = 0
j = 0
target = ""
lines.each do |line|
    if j == 0 
      target = sort(line)
      j += 1
    else
      if target == sort(line)
        i += 1
      end
    end
end

puts i