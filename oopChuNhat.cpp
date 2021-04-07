#include <bits/stdc++.h>
using namespace std;
class HCN
{
private:
    float w, h;

public:
    void set_w(float a);
    void set_h(float b);
    float get_w();
    float get_h();
    float dienTich();
    float chuVi();
};

void HCN::set_w(float a)
{
    w = a;
}

void HCN::set_h(float b)
{
    h = b;
}

float HCN::get_h()
{
    return h;
}
float HCN::get_w()
{
    return w;
}

float HCN::dienTich()
{
    return w * h;
}
float HCN::chuVi()
{
    return (w + h) * 2;
}
int main()
{
    float a, b;
    cout << "Nhap chieu rong: ";
    cin >> a;
    cout << "Nhap chieu dai: ";
    cin >> b;
    HCN giaihcn;
    giaihcn.set_h(b);
    giaihcn.set_w(a);
    giaihcn.get_h();
    giaihcn.get_w();
    cout << "Chu vi: " << giaihcn.chuVi() << endl;
    cout << "Dien tich: " << giaihcn.dienTich() << endl;

    system("pause");
}