import sys
sys.setrecursionlimit(100000)

def make_var_name(i):
    s = "v"
    while (i > 0):
        s += chr(97 + i%26)
        i -= i%26
        i //= 26
    return s

def for_loop(i, content):
    var1 = make_var_name(i)
    var2 = make_var_name(i+1)
    return f"for (int {var1} = 0 ; {var1} < {var2} ; {var1} = {var1} + 1) {"{"}\n" + content + "}"



def deep_for_loop(depth):
    return for_loop(depth, "int a = 42;\n") if depth == 0 else for_loop(depth, deep_for_loop(depth-1))

def main():
    for i in range(150):
        depth = int(sys.argv[1])

        print("int main() {\n int " + make_var_name(depth+1) + " = 50;\n")
        print(deep_for_loop(depth))
        print("}\n")



main()