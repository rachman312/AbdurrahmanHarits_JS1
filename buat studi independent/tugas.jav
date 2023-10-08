 if (a === b && b === c) {
  console.log("Segitiga sama sisi");
} else if (a === b || b === c || c === a) {
  console.log("Segitiga sama kaki");
} else if (
  a * a + b * b === c * c ||
  a * a + c * c === b * b ||
  b * b + c * c === a * a
) {
  console.log("Segitiga siku-siku");
} else {
  console.log("Segitiga sembarang");
}






switch (bulan) {
    case 1:
      console.log("Januari");
      break;
    case 2:
      console.log("Februari");
      break;
    case 3:
      console.log("Maret");
      break;
    case 4:
      console.log("April");
      break;
    case 5:
      console.log("Mei");
      break;
    case 6:
      console.log("Juni");
      break;
    case 7:
      console.log("Juli");
      break;
    case 8:
      console.log("Agustus");
      break;
    case 9:
      console.log("September");
      break;
    case 10:
      console.log("Oktober");
      break;
    case 11:
      console.log("November");
      break;
    case 12:
      console.log("Desember");
      break;
    default:
      console.log("Nomor bulan tidak valid");
  }






  for (var huruf = 'A'; huruf <= 'Z'; huruf = String.fromCharCode(huruf.charCodeAt(0) + 1)) {
    console.log(huruf);
  }






  var i = 1;

while (i <= 5) {
  console.log(i);
  i++;
}

var j = 1;

do {
  console.log(j);
  j++;
} while (j <= 5);







function sapaOrang(nama) {
    console.log(`Halo, ${nama}!`);
  }
  
  sapaOrang("Joko");
  
  function penjumlahan(bil1, bil2) {
    return bil1 + bil2;
  }
  
  var hasilPenjumlahan = penjumlahan(8, 4);
  console.log(`Hasil penjumlahan: ${hasilPenjumlahan}`);
  
  function cekParitasAngka(angka) {
    if (angka % 2 === 0) {
      return "Genap";
    } else {
      return "Ganjil";
    }
  }
  
  var bilanganBaru = 6;
  console.log(`${bilanganBaru} adalah bilangan ${cekParitasAngka(bilanganBaru)}`);
  
  
  
  
  
  
  