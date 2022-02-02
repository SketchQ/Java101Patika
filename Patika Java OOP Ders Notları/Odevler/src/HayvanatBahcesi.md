# Hayvanat Bahçesi Yönetimi

Bir hayvanat bahçesindeki hayvanlar hakkındaki bilgileri takip etmek için bir sistem tasarlıyorsunuz.

**Hayvanlar:**

1. Atlar (atlar, zebralar, eşekler vb.)
1. Kedigiller (kaplanlar, aslanlar vb.)
1. Kemirgenler (sıçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.
1. Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır.
tür adı, ağırlığı, yaşı vb.
1. Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()
1. Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()
1. Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.

Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlayın.

![Ödev](http://www.plantuml.com/plantuml/png/ZP0n2i9G38RtdEAvwT0hI0iYWgCdYE-5rz2qGf8AHRsPcnUprQ6WIxUGvFl_v2_DKRrl1LPUKql16l9O3u1dSyNe8GgQXGCEL-m4zGR-UcgL60Oq1ioimWrayjt5CDDwCzLxedIADQLUfiu3lYgLJmeBbu-KEBC8QLYEjAoPkYNC27tE2KLVtBVpWp3x_eu2p0R_N4bT6eDy0m00)
