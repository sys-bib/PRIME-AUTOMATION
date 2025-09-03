Feature: End To End Testing

  Background: Access website PRIME
    Given access prime 'https://localhost:44355/'

  @endtoend
  Scenario: end to end test
    #Create Request
    Given click login button
    And i fill in the column email with 'user.prime1@pertamina.com'
    And click button next
    And i fill in the column password with 'Onecode@2023'
    Then click login button idaman
    And choose list my request on file transfer
    And click button new file transfer
    #Step Sender
    And fill noskorganisasi with 'SK001'
    And fill nomorhp with '0813748211'
    And fill alamat with 'bsd'
    Then click nextsender button
    #Step File {1}
    Then click addfile button
    And choose kode klasifikasi berkas 'S0.10'
    And choose keterangan akses dan keamanan 'Biasa'
    And fill nama berkas with 'Berkas 3'
    And fill lokasi simpan with 'lokasi'
    And fill uraian informasi with 'uraian 1'
    And choose kategori arsip 'Aset'
    And choose waktu berkas mulai '2020'
    And choose waktu berkas akhir '2021'
    And choose tingkat perkembangan berkas 'Asli'
    And fill jenis berkas with 'jenis'
    And fill jumlah item with '1'
    Then click button add on file
    Then click button ok
    Then click button add item
    And fill perihal with 'Perihal 2'
    And fill nomor dokumen with 'nomor 1'
    And fill keterangan with 'nomor 1'
    And fill jumlah dokumen with '1'
    And upload file digital in directory 'C:\Users\USER\Downloads\sample.pdf'
    And choose bentuk arsip 'Kertas'
    And choose tingkat perkembangan berkas item 'Asli'
    And choose tanngal dokumen with '09/14/2023'
    Then click button add on item
    #Step File {2}
    Then click addfile button
    And choose kode klasifikasi berkas 'S0.10'
    And choose keterangan akses dan keamanan 'Biasa'
    And fill nama berkas with 'Berkas 4'
    And fill lokasi simpan with 'lokasi'
    And fill uraian informasi with 'uraian 2'
    And choose kategori arsip 'Aset'
    And choose waktu berkas mulai '2020'
    And choose waktu berkas akhir '2021'
    And choose tingkat perkembangan berkas 'Asli'
    And fill jenis berkas with 'jenis'
    And fill jumlah item with '1'
    Then click button add on file
    Then click button ok
    Then click button add item 2
    And fill perihal with 'Perihal 4'
    And fill nomor dokumen with 'nomor 2'
    And fill keterangan with 'nomor 1'
    And fill jumlah dokumen with '1'
    And upload file digital in directory 'C:\Users\USER\Downloads\sample.pdf'
    And choose bentuk arsip 'Kertas'
    And choose tingkat perkembangan berkas item 'Asli'
    And choose tanngal dokumen with '09/14/2023'
    Then click button add on item
    Then click button submit
    And choose yes submit
    #Approve request
    And logout account
    Given access prime 'https://localhost:44355/'
    Given click login button
    And i fill in the column email with 'user.prime2@pertamina.com'
    And click button next
    And i fill in the column password with 'Onecode@2023'
    Then click login button idaman
    And click bell icon
    And click view all messages
    And choose notif request
    Then click button approve
    And choose yes approve
    #Assign request
    And logout account
    Given access prime 'https://localhost:44355/'
    Given click login button
    And i fill in the column email with 'mk.otniel.lumban@pertamina.com'
    And click button next
    And i fill in the column password with 'Satukode@2023_New'
    Then click sign in button idaman
    And click button confirm
    And choose yes
    And click bell icon
    And click view all messages
    And choose notif approved
    Then click button assign to
    And choose rcpic
    And click button assign
    #Survey request
    And logout account
    Given access prime 'https://localhost:44355/'
    Given click login button
    And i fill in the column email with 'mk.bobi.hatmaji@pertamina.com'
    And click button next
    And i fill in the column password with 'Satukode@2023_New'
    Then click sign in button idaman
    And click button confirm
    And choose yes
    And click bell icon
    And click view all messages
    And choose notif assigned
    Then click tab survey
    And fill media arsip 'media'
    And fill jumlah '2'
    And fill sistem penataan 'sistem'
    And fill catatan 'catatan'
    And choose tanggal survey '12/29/2023'
    And choose kondisi arsip 'Baik'
    And choose bentuk arsip dan isi
    And choose sarana simpan
    And choose retensi arsip
    And choose rekomendasi
    And choose rc penyimpanan sementara
    And upload file digital in directory 'C:\Users\USER\Downloads\sample.pdf'
    And choose kurun waktu '2023'
    Then click button submit
    And choose yes submit survey
    #Approve Survey
    And logout account
    Given access prime 'https://localhost:44355/'
    Given click login button
    And i fill in the column email with 'mk.otniel.lumban@pertamina.com'
    And click button next
    And i fill in the column password with 'Satukode@2023_New'
    Then click sign in button idaman
    And click button confirm
    And choose yes
    And click bell icon
    And click view all messages
    And choose notif surveyed
    Then click button approve
    And choose yes approve
    #Signing
    #Req.Creator Sign
    Given click login button
    And i fill in the column email with 'user.prime1@pertamina.com'
    And click button next
    And i fill in the column password with 'Onecode@2023'
    Then click login button idaman
    And click bell icon
    And click view all messages
    And choose notif baonprogress
    And click sign this document button
    And choose sign
    And logout account
    Given access prime 'https://localhost:44355/'
    #Req.Approver Sign
    Given click login button
    And i fill in the column email with 'user.prime2@pertamina.com'
    And click button next
    And i fill in the column password with 'Onecode@2023'
    Then click login button idaman
    And click bell icon
    And click view all messages
    And choose notif request
    And click sign this document button
    And choose sign
    And logout account
    Given access prime 'https://localhost:44355/'
    #RC.Approver Sign
    Given click login button
    And i fill in the column email with 'mk.otniel.lumban@pertamina.com'
    And click button next
    And i fill in the column password with 'Satukode@2023_New'
    Then click sign in button idaman
    And click button confirm
    And choose yes
    And click bell icon
    And click view all messages
    And choose notif request
    And click sign this document button
    And choose sign
    And logout account
    Given access prime 'https://localhost:44355/'
    #RC.PIC Sign
    Given click login button
    And i fill in the column email with 'mk.bobi.hatmaji@pertamina.com'
    And click button next
    And i fill in the column password with 'Satukode@2023_New'
    Then click sign in button idaman
    And click button confirm
    And choose yes
    And click bell icon
    And click view all messages
    And choose notif request
    And click sign this document button
    And choose sign
    And complete sign