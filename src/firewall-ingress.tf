resource "google_compute_firewall" "i23-ni-gcp" {
  name = "devsecops-fw-multi-ip"
  network = "devsecops-network-gcp"

  allow {
    protocol = "udp"
    ports = [
      "137",
      "138"]
  }

  priority = 1400
  source_ranges = [
    "192.168.1.1/32",
    "192.168.1.2/32",
    "192.168.1.3/32",
    "192.168.1.4/32",
    "192.168.1.5/32"]
}