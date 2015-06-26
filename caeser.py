A_int = ord('A')
Z_int = ord('Z')

def shift_char(char_in, shift):
  char_out = ord(char_in) + shift
  shift_amt = char_out - A_int
  return chr(char_out) if shift_amt < 26 else chr(char_out-26)

str_in = raw_input("Input a string to shift:\n").upper()
str_out = ""

while (True):
  try:
    shift = int(raw_input("How much do you want to shift by? >=0 or <=26\n"))
    if (shift < 0 or shift > 26):
      print "Invalid input"
    break
  except ValueError:
    print "Invalid input"

for c in str_in:
  if (ord(c) < A_int or ord(c) > Z_int):
    str_out += c
  else:
    str_out += shift_char(c,shift)

print "Your encoded string is:\n%s" % (str_out)
