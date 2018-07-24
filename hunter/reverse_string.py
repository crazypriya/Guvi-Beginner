def reverse(s):
  str = ""
  for i in s:
    str = i + str
  return str
s = input()
r = input() 
t=reverse(s)
u=reverse(r)
print (t+" "+u)
