resource "google_compute_route" "foobar" {
  name        = "devsecops-route"
  dest_range  = "15.0.0.0/24"
  network     = "devsecops-network-gcp"
  next_hop_ip = "10.0.1.5"
  priority    = 100
}