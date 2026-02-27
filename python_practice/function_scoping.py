def my_func() -> str:
    var = "Hello Workd!"
    bp = "kakutu"
    # print(var)
    return var, bp


my_func()
print("\n\n tests \n\n")

m,n = my_func()
print(m)
print(my_func())
